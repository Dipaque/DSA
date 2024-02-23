package DataStructures;
/******************************************************************************

Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class OperatorPrecendence
{
static int  top=-1;
public void push(char stack[],char data,int n) {
if(top==n-1) {
System.out.println("Stack Overflow");
}
else {
top=top+1;
stack[top]=data;
}
}
public void pop() {
if(isEmpty()) {
System.out.println("Stack Underflow");
}
else {
top=top-1;
}
}
public void display(char stack[]) {
for(int i=top;i>=0;i--) {
System.out.println(stack[i]);
}
}
public boolean isEmpty() {
if(top==-1) {
return true;
}
else {
return false;
}
}
public static void main(String[] args) {
String str="{{}(})" ;
boolean found =true;
char ch[]=str.toCharArray();
OperatorPrecendence m=new OperatorPrecendence();
char stack[]=new char[ch.length];
for(int i=0;i<stack.length;i++){
if(ch[i]=='{'|| ch[i]=='['|| ch[i]=='('){
m.push(stack,ch[i],stack.length);
}
else if(ch[i]==')'){
if(stack[top]=='[' || stack[top]=='{'){
found = false;
break;
}
else{
 top--;
}
}
else if(ch[i]==']'){
if(stack[top]=='(' || stack[top]=='{'){
found = false;
break;
}
else{
top--;
}
}
else if(ch[i]=='}'){
if(stack[top]=='[' || stack[top]=='('){
found = false;
break;
}
else{
top--;
}
}
}
if(found==true && top==-1){
System.out.print("true");
}
else{
System.out.print("false");
}
}
//m.display(stack);
}

