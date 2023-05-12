public class BinarySearchTree {

    static class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int key) {
            this.key = key;
        }
    }

    public TreeNode root;

    /**
     * 插入一个元素
     * @param key
     */
    public boolean insert(int key) {
        if (root==null){
            root=new TreeNode(key);
            return true;
        }
        TreeNode treeNode=new TreeNode(key);
        TreeNode cur=root;
        TreeNode parent=null;
        while (cur!=null){
           if(cur.key>treeNode.key){
               parent=cur;
               cur=cur.left;
           }else if(cur.key<treeNode.key){
               parent=cur;
                cur=cur.right;
            } else{
            return false;
        }
        }
        if (key< parent.key){
            parent.left=treeNode;
        }else {
            parent.right=treeNode;
        }
        return true;
    }
    //查找key是否存在
    public TreeNode search(int key) {
      
        return null;
    }
    //删除key的值
    public boolean remove(int key) {
       
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            binarySearchTree.insert(arr[i]);
        }
        System.out.println("hallo ");
    }
   
}