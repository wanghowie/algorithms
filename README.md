# algorithms
算法学习，写的一些例子
这些算法案例都是在学习算法4的时候，随书练习，并且添加了个人的理解。
如果你想整体学习算法的话，建议访问https://algs4.cs.princeton.edu/home/
算法易掉发，入坑需慎重！

## 算法基础
常用的数据结构,每种数据结构都有他特定的应用场景，在datastructure包中包中，实现了三种常用的数据结构： 包、堆栈、队列。
* **包**：只进不出的数据结构,一个用于收集数据，然后遍历数据的数据结构，不能移除数据
* **堆栈**：一种后进先出(LIFO)数据结构
* **队列**：一种先进先出(FIFO)的数据结构
在datastructure.demo中列举了一些列数据结构的场景,其中queue包中是队列的用例，stack中是堆栈的用例。  
**queue包**  

|类名|算法含义|
|:-:|:-:|
| DogCatQueueAlg.java |猫狗队列|
| Josephus.java |约瑟夫斯问题|
| !!!MultiwordSearch.java |多字搜索|
| QueueWithTwoStacks.java |两个堆栈实现一个队列|
| ResizingArryQueue.java |数组大小调整队列|
| SlidingWindowMaxArray.java |生成窗口最大值|
| TwoStacksImplementQueue.java |两个堆栈生成一个队列|  

**stack包**  

|类名|算法含义|
|:-:|:-:|
| Evaluate.java |堆栈实现算数计算器|
| EvaluateDeluxe.java |按优先级计算(中缀表达式计算器)|
|EvaluatePostfix.java| 后缀表达式计算(算式必须是完全括号表达式)|
|FixedCapacityStack.java|固定容量的通用堆栈|
|FixedCapacityStackOfStrings.java|固定容量的字符串堆栈|
|GetMinStack.java|实现栈的基本功能，并且可以返回栈中最小元素时间复杂度O(1)|
|HanoiStack.java|汉诺塔，提供递归和堆栈两种算法|
|Parentheses.java|平衡字符串|
|ResizingArrayStack.java|数组大小调整堆栈|
|ReverseStackUsingRecursive.java|使用一个栈和递归实现堆的转置|
|StackSortStack.java | 栈排序|

## 连通性（uf包）
|类名|算法含义|
|:-:|:-:|

##常用的排序算法sort
1. 基础排序算法SortAlgorithm.java
 * 选择排序(Select Sort)
   核心就不停的选择无序区最小值跟无序区的第一个值交换位置（升序时）。
   首先，找到数组中最小的项，然后与第一项交换。然后，找到下一个最小的项并将其与第二个条目交换。
   以这种方式继续，直到对整个数组进行排序。
   
 * 插入排序(Insertion Sort)
   核心：左侧已排序元素相对有序
   人们通常用来对桥牌进行分类的算法是一次考虑一张牌，将每张牌插入到已经考虑过的牌中的适当位置（对它们进行分类）。
   在计算机实现中，我们需要在将当前项目插入到空出位置之前，通过将较大的项目向右移动一个位置来为当前项目腾出空间。
   
 * 希尔排序(Shell Sort)
   核心:数组中任意间隔为h的元素是有序的
   希尔排序，通过插入排序实现；可用于大型数组。与选择和插入排序相比较，数组越大，优势越明显。
   递增序列可以提高性能。通常情况序列1/2(3^k-1)即可。也可以使用复杂的序列：9×4^k-9×2^k+1(k=1,2,3,4,5…) 和 4^k-3×2^k+1(k=1,2,3,4,5…)
   通过插入排序实现；可用于大型数组。与选择和插入排序相比较，数组越大，优势越明显 
   
 * 归并排序(Merge Sort)
   
   合并两个有序数组以组成一个更大的有序数组；并归算法体现了分治思想，是一个渐进最优的基于比较排序的算法。
   提供两种并归排序实现方案：自顶而下和自底向上
   
 * 快速排序：
  与并归排序相似，快速排序将数组按照切分点，分为两部分，左边元素都小于切分点，右边元素都大于切分点。当切分点两侧的元素有序时，数组有序。
