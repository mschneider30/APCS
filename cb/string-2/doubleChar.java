public String doubleChar(String str) {
  int i=0;
  String s;
  s = "";
  while (i < str.length()) {
    s+=str.substring(i,i+1);
    s+=str.substring(i,i+1);
    i++;
  }
  return s;
}
