class Solution {
    int ans=0;
    public int findTilt(TreeNode root) {
        sum(root);
        return ans;
    }
    int sum(TreeNode r){
        if(r==null) return 0;
        int l=sum(r.left),x=sum(r.right);
        ans+=Math.abs(l-x);
        return l+x+r.val;
    }
    }
