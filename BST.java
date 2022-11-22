/**
 * Binary tree review to prepare for the homework assignment
 */

 public class BST{
    // node containing the beginning of the the tree
    private Node root;

    public BST(){
        root = null;
    }// end BST constructor

    void insert(String topic, String subTopic){
        // create temp nodePtr to traverse tree and set to root
        
        Node temp;

        // check if root is null then set it to temp
        if(root == null){
            root = temp;
            System.out.println("Inserting node at root");
            return;
        }// end if(root == null)
        else if(topic.compareTo(this.root.getTopic()) <= 0){
            if()
        }



    }
    private class Node{
        private String topic;
        private String subTopic;
        private int count;
        private int height;
        private Node left;
        private Node right;
        
        public Node(String topic, String subTopic){
            this.topic = topic;
            this.subTopic = subTopic;
            this.count = 0;
            this.left = null;
            this.right = null;
        }// end Node constructor
        
        public String getTopic() {
            return topic;
        }// end Node getTopic
        public void setTopic(String topic) {
            this.topic = topic;
        }// end Node setTopic
        public String getSubTopic() {
            return subTopic;
        }// end Node getSubTopic
        public void setSubTopic(String subTopic) {
            this.subTopic = subTopic;
        }// end Node setSubTopic
        public int getCount() {
            return count;
        }// end getCount
        public void setCount(int count) {
            this.count = count;
        }// end of setCount
        public int getHeight() {
            return height;
        }// end of getHeight()
        public void setHeight(int height) {
            this.height = height;
        }// end of setHeight()
        public Node getLeft() {
            return left;
        }// end of getLeft()
        public void setLeft(Node left) {
            this.left = left;
        }// end 
        
    }// end Node class
    


 }