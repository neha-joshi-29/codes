class Solution {
    public String removeKdigits(String num, int k) 
    {
     if (num.length() == k) {
      return "0";
    }
    StringBuilder stack = new StringBuilder();
    for (char c : num.toCharArray()) {
      int val = c - '0';
      if (stack.length() == 0 || k == 0) {
        stack.append(val);
      } else {
        int lastVal = stack.charAt(stack.length() - 1) - '0';
        if (lastVal <= val) {
          stack.append(val);
        } else {
          while (lastVal > val && k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
            if (stack.length() == 0) {
              break;
            }

            lastVal = stack.charAt(stack.length() - 1) - '0';
          }
          stack.append(val);
        }
      }
    }
    // this delete the last characters which are in increasing order
    // like 12345 -> delete 45
    if (k != 0) {
      stack.delete(stack.length() - k, stack.length());
    }
    // delete leading 0's
    int i = 0;
    while (i < stack.length() && stack.charAt(i) == '0') {
      i++;
    }
    stack.delete(0, i);

    if (stack.length() == 0) {
      stack.append("0");
    }

    return stack.toString();
  }}
    
        
    
