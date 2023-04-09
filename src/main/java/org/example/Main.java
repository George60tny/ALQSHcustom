package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyArrayList");
        MyArrayList<String> arrayList = new MyArrayList<>();

        // add
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        // get
        System.out.println(arrayList.get(0)); // a
        System.out.println(arrayList.get(1)); // b
        System.out.println(arrayList.get(2)); // c

        // size
        System.out.println(arrayList.size()); // 3

        // remove
        arrayList.remove(1);
        System.out.println(arrayList.get(1)); // c

        // clear
        arrayList.clear();
        System.out.println(arrayList.size()); // 0

        System.out.println("MyLinkedList");
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        // add
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        // get
        System.out.println(linkedList.get(0)); // a
        System.out.println(linkedList.get(1)); // b
        System.out.println(linkedList.get(2)); // c

        // size
        System.out.println(linkedList.size()); // 3

        // remove
        linkedList.remove(1);
        System.out.println(linkedList.get(1)); // c

        // clear
        linkedList.clear();
        System.out.println(linkedList.size()); // 0

        System.out.println("MyQueue");
        MyQueue<String> queue = new MyQueue<>();

        // add
        queue.add("a");
        queue.add("b");
        queue.add("c");

        // size
        System.out.println(queue.size()); // 3

        // peek
        System.out.println(queue.peek()); // a

        // poll
        System.out.println(queue.poll()); // a
        System.out.println(queue.size()); // 2

        // clear
        queue.clear();
        System.out.println(queue.size()); // 0

        System.out.println("MyStack");
        MyStack<String> stack = new MyStack<>();

        // push
        stack.push("a");
        stack.push("b");
        stack.push("c");

        // size
        System.out.println(stack.size()); // 3

        // peek
        System.out.println(stack.peek()); // c

        // pop
        System.out.println(stack.pop()); // c
        System.out.println(stack.size()); // 2

        // remove
        stack.remove(1);
        System.out.println(stack.peek()); // b
        System.out.println(stack.size()); // 1

        // clear
        stack.clear();
        System.out.println(stack.size()); // 0

        System.out.println("MyHashMap");
        MyHashMap<String, String> hashMap = new MyHashMap<>();

        // put
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        hashMap.put("c", "3");

        // get
        System.out.println(hashMap.get("a")); // 1
        System.out.println(hashMap.get("b")); // 2
        System.out.println(hashMap.get("c")); // 3

        // size
        System.out.println(hashMap.size()); // 3

        // remove
        hashMap.remove("b");
        System.out.println(hashMap.get("b")); // null

        // clear
        hashMap.clear();
        System.out.println(hashMap.size()); // 0
    }
}