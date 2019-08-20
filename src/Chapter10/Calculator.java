package Chapter10;

import java.util.Stack;

public class Calculator {

    //声明一个stack栈存储并操作所有相关的解释器
    private Stack<ArithmeticExpression> mExpStack = new Stack<>();

    public Calculator(String expression) {
        //声明两个ArithmeticExpression类型的临时变量，存储运算符左右两边的数字解释器
        ArithmeticExpression exp1, exp2;

        //根据空格分割表达式字符串
        String[] elements = expression.split(" ");

        //循环遍历表达式元素数组
        for (int i = 0; i < elements.length; i++) {
            //判断运算符号
            switch (elements[i].charAt(0)) {
                case '+':   //如果是加号
                    //将栈中的解释器弹出作为运算符左边的解释器
                    exp1 = mExpStack.pop();
                    //将运算符号数组下标的下一元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过上面两个数字解释器构造加法运算解释器
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-'://如果是减号
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubtractionExpression(exp1, exp2));
                default://如果是数字
                    //直接构造数字解释器并压入栈
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 计算结果
     * @return 最终的计算结果
     */
    public int calculate() {
        return mExpStack.pop().interpret();
    }

}
