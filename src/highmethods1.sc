var a=Array(1,2,3)
var b = List(1,2,3)
a.foreach(println)//a.foreach(i=>println(i))
a.map(_*2)//a.map(i=>i*2)
a.filter(_>2)
a.map(i=>b.take(i))
a.flatMap(i=>b.take(i))
a.exists(_>3)
a.forall(_<10)
//reduce
a.reduceLeft((x,y)=>x+y)
//OR
a.reduceLeft(_+_)

a.foldLeft("0")(_+_)

b.find(_%2==0).map(_+5).getOrElse(0)


