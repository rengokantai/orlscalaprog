var arr = Array(1,2)
var lst = List(1,2)
var lst2= 2::lst//immutable
arr(0)=3
arr
var arr2=Array[Int](10)
var arr3 = Array.fill(10)(3)
var arr4 = Array.fill(10)(3)
//generate randoms
var ran1 = Array.fill(10)(math.random)
//using function
//1st version
def random1(i:Int):Array[Int]=Array(i,i,i)
random1(util.Random.nextInt(10))
//pass by name, generate distinct numbers
def random2(i: =>Int):Array[Int]=Array(i,i,i)
random2(util.Random.nextInt(10))
//pass index Ex:0=0*0,..4=2*2
val tabular =Array.tabulate(10)(i=>i*i)

//vector
Vector(1,2)
collection.mutable.Buffer(1,2)
0.1 to 1 by 0.1
1.to(10)
