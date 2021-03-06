package datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 描述:
 * 后进先出(LIFO)堆栈
 *
 * @author wanghui email:wanghuiaf@yonyou.com
 * @create 2020-04-29 下午3:12
 */
public class Stack<Item> implements Iterable<Item> {
    private Node<Item> first;     // 栈顶元素
    private int n;               // 栈大小

    /**
     * 初始化空栈
     */
    public Stack() {
        first = null;
        n = 0;
    }

    /**
     * 拷贝构造函数
     * @param s  拷贝构造函数
     */
    public Stack(Stack<Item> s) {
        if (s.first != null) {
            first = new Node<Item>(s.first);
            for (Node<Item> x = first; x.next != null; x = x.next)
                x.next = new Node<Item>(x.next);
        }
        n = s.size();
    }
    /*拷贝构造函数——递归构造
    public Stack(Stack<Item> s) {
        first = new Node(s.first);
        n = s.size();
    }
    */

    /**
     *堆栈判空
     *
     * @return  如果堆栈为空，返回{@code true};否则，返回 {@code false}
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * 堆栈元素数量
     *
     * @return n
     */
    public int size() {
        return n;
    }

    /**
     * 向堆栈中添加元素
     *
     * @param  item
     */
    public void push(Item item) {
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    /**
     * 返回并移除栈顶元素
     *
     * @return
     * @throws NoSuchElementException if this stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }


    /**
     * 返回但是不删除栈顶元素
     *
     * @return
     * @throws NoSuchElementException if this stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * 堆栈的字符串形式
     *
     * @return
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }


    /**
     * 后进先出迭代器
     * @return
     */
    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    // 内部类，链存储数据
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;

        public Node(){

        }

        public Node(Node<Item> x) {
            this.item = x.item;
            this.next = x.next;
        }

        /*递归构造
        Node(Node<Item> x) {
            item = x.item;
            if (x.next != null) next = new Node(x.next);
        }
        */
    }


    // 迭代器内部类
    private class LinkedIterator implements Iterator<Item> {
        private Node<Item> current;

        public LinkedIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}
