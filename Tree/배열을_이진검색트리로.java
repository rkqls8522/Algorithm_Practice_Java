package Tree;

public class 배열을_이진검색트리로 {

    //트리노드를 만들자
    class Node{
        int data; //해당 노드의 데이터값
        Node left;
        Node right;

        //생성자
        Node (int data){
            this.data = data;
        }
    }

    Node root; //루트노드가 있다

    //배열 정보를 받아서 트리를 만드는 것을 "시작"해주는 함수
    void makeTree(int[] a) {
        root = makeTreeR(a, 0, a.length-1);
    }

    Node makeTreeR(int[] a, int start, int end) {
        if(start > end) return null; //시작 노드가 더 커지면 멈춰야 무한으로 돌지 않는다.

        int mid = (start+end)/2; //중간 값을 찾아야 함. 이 때, 중간값이란 (시작 더하기 끝) 나누기 2이다.

        Node node = new Node(a[mid]); // 노드를 생성하는데, 해당 데이터값은 배열의 중간노드의 데이터값.

        node.left = makeTreeR(a, start, mid-1); //왼쪽 노드를 생성하는데, 시작지점은 그대로, 끝지점은 반자른 지점으로

        node.right = makeTreeR(a, mid+1, end); //오른쪽 노드를 생성하는데, 시작지점은 반자른 지점으로, 끝지점은 그대로
    }


    public static void main(String[] args) {
        System.out.println("hello");



    }








}

