// Program 3 Validate IPv4 and Ipv6 address
// https://leetcode.com/problems/validate-ip-address/submissions/

class Solution {
    public String validIPAddress(String IP) {
        int count =0;
       if(IP.indexOf(".") != -1){
           for( String p: IP.split("\\.")){
               ++count;
               if( count > 4 || p.isEmpty() || (p.length() > 1 && p.charAt(0) == '0') || p.length() > 3)
                   return "Neither";
               for(char c: p.toCharArray())
                   if( c < '0' || c > '9')
                       return "Neither";
               int val = Integer.parseInt(p);
               if(val < 0 || val > 255)
                   return "Neither";                                                           
           }
           return count == 4 && IP.charAt(IP.length() -1) != '.' ? "IPv4" : "Neither";
       } 
        
       else{
           for(String p: IP.split(":")){
               ++count;
               if( count > 8 || p.isEmpty() || p.length() >4)
                   return "Neither";
               for(char c :p.toCharArray())
                   if( !(c >= '0' && c <= '9') && !(c >= 'a' && c <= 'f') && !(c >= 'A' && c <= 'F'))
                       return "Neither";
           }
           return count == 8 && IP.charAt(IP.length()-1) != ':' ? "IPv6" : "Neither";
       }
        
    }
}

// Example 1:

// Input: IP = "172.16.254.1"
// Output: "IPv4"
// Explanation: This is a valid IPv4 address, return "IPv4".
// Example 2:

// Input: IP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
// Output: "IPv6"
// Explanation: This is a valid IPv6 address, return "IPv6".