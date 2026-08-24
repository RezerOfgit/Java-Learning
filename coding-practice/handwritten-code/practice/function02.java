// 面试常问：什么是闭包？
// 函数能访问它定义时所在的词法作用域，即使函数在别处执行。

function createCounter() {
  let count = 0;
  return function() {
    return ++count;
  };
}
const counter = createCounter();
counter(); // 1
counter(); // 2
// count 变量被闭包"关"在里面，外部无法直接访问