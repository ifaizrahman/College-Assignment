import java.util.*;

class Solution {
    
    class SegmentTree {
        int[] tree;
        int n;

        SegmentTree(int[] arr) {
            n = arr.length;
            tree = new int[4 * n];
            build(arr, 0, 0, n - 1);
        }

        // Build segment tree
        void build(int[] arr, int i, int left, int right) {
            if (left == right) {
                tree[i] = arr[left];
                return;
            }
            int mid = (left + right) / 2;
            build(arr, 2 * i + 1, left, mid);
            build(arr, 2 * i + 2, mid + 1, right);
            tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        }

        // Query for sum in range [l, r]
        int query(int i, int left, int right, int l, int r) {
            // No overlap
            if (right < l || r < left) return 0;

            // Total overlap
            if (l <= left && right <= r) return tree[i];

            // Partial overlap
            int mid = (left + right) / 2;
            int leftSum = query(2 * i + 1, left, mid, l, r);
            int rightSum = query(2 * i + 2, mid + 1, right, l, r);
            return leftSum + rightSum;
        }
    }

    public List<Integer> querySum(int n, int arr[], int q, int queries[]) {
        SegmentTree st = new SegmentTree(arr);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 2 * q; i += 2) {
            int l = queries[i] - 1;     // Convert to 0-based
            int r = queries[i + 1] - 1;
            result.add(st.query(0, 0, n - 1, l, r));
        }

        return result;
    }
}
