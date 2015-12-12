val(c,d)=(3,5)

var a = 1

var b= 6

var temp = 6
val result = (a*3,b) match {
  case (3,6) => "zero"
  case (6,18) => "one"
  case (_,_) => "something"
}

val res = a*6 match{
  case 1 => "3"
    //should use backtick
  case `temp`=> "same as b"
}