# task 0 - 0204
GitHub账号，创建工程，clone到本地。在目录中创建README文件，提交四次，
空文件，增加一行，增加第2行，增加第3行，利用历史会退到第两行增加前，
增加内容不同的一行，把工程push到GitHub上。
# task 1 - 0205
机器上安装好JDK1.8,IDEA社区版和maven,创建一个maven工程，包含JUnit4的依赖
写个hello world的方法，在控制台打印 hello world。分别在IDE和命令行中build工程。
使用jar命令运行产生的jar文件，把工程加入到git中。
# task 2 - 0208

## task 2-1
修改程序，让它打印从1~100的数字。

## task 2-2
再次修改,逻辑变为:如果数字为3的倍数，打印fizz,
5的倍数打印buzz，其他情况还是数字。
## task 2-3
针对程序，写一个单元测试。
## task 2-4
修改程序接受一个参数，表示打印的上限，比如20 表示从1到数到20。
参数应该有相应的校验，不输入默认100。
### to-think 
Comment:参数值并没有带入到后面的处理中？

### to-think
异常处理和打印输出，在相同的层次上处理
理解：放在函数里处理，不一定在main方法里。

### to-think
=============try catch finally=============
refer:https://www.cnblogs.com/lulipro/p/7504267.html

## task 2-5 0306
想象这个游戏模拟的是一组人围成一圈报数的游戏，每个人需要报出正确的数字或fizz buzz.
现在你是10个人中第1个，轮到你的时候命令行提示your turn并等待，
如果输入正确游戏继续，输入错误游戏结束并提示。


## task 2-6 0316
接受第2个参数表示一圈人的个数。你的位置随机产生。

## task 2-7 
接受一个参数 -a 在两个数字参数之前，如果有的话表示游戏规则中除了3的倍数，包含3的数字也需要变成fizz,比如13，
5的情况也依次类推。如果没有则保持原逻辑。

## task 2-8 plus
约瑟夫问题是个有名的问题： * N个人围成一圈，从第一个开始报数，第M个将被出局，最后剩下一个，其余人都将被出局。
http://www.10qianwan.com/articledetail/758025.html

# task 3 0408
这是个数学概率题，但是不要求用数学计算，而是用计算机模拟。
已知一个黑箱里有30个红球，50个白球，120个蓝球，
它们除了颜色之外，其他方面都一模一样。
我们每次可以伸手进去取一个球，当然自己看不到球的颜色，
问：依次取球的时候，红球最先取完的概率是多少？

写一段程序模拟100万次摸球，输出概率。