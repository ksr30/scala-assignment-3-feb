class VowelSum {
  def subString(str2:String)= {
    val subArray=Array.ofDim[Int](str2.length-1,str2.length-1)
    for (i <- 0 to str2.length-1; j <- 0 to str2.length-1) {
      val str3 = str2.slice(i, j + 1)
      val temp=Array(0)
      for(element<-str3){

        if (element=='a'|| element=='e' || element== 'i' || element=='o'||element=='u'){
          temp(0)+=1
        }
      }
      subArray(i)(j)=temp(0)
    }
    subArray
  }

  def main(arg:Array[String]): Unit ={
    println("Enter String")
    val str=scala.io.StdIn.readLine()
    val finalArray=subString(str)
    val sum=Array(0)
    for(rowElement<-0 until finalArray.length;columnElement<-0 until finalArray.length) {
      sum(0)+= finalArray(rowElement)(columnElement)
    }
    println("Total Number of array" + sum(0))

  }
}


