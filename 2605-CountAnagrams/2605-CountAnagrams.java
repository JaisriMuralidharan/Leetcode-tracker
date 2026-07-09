// Last updated: 7/9/2026, 11:27:25 AM
class Solution {
    long mod=1000000007L;
     public long pow(long n,long base)
     {
         long ans=1;
         while(n>0)
         {
             if(n%2==1)
             {
                 ans=(ans*base)%mod;
             }
              n>>=1;
             base=(base*base)%mod;
            

         }
         return ans;

     }
     public long inv(long n)
     {
         return pow(mod-2,n);
     }
     long [] fact;
    public long ways(String word)
    {
        int [] a=new int[26];
        for(int i=0;i<word.length();i++)
        {
            a[word.charAt(i)-'a']++;
        }
        int n=word.length();
        long ans=fact[n];
        for(int i=0;i<26;i++)
       {
           if(a[i]>0)
           {
               int s=a[i];
               long fac=fact[s];
               long jj=inv(fac)%mod;
               ans=(1L*ans*jj)%mod;
           }
       }
       return ans;
    }
    public int countAnagrams(String s) {
        fact=new long [s.length()+1];
        fact[0]=1L;
        int n=s.length();
        System.out.println(n);
        for(int i=1;i<=n;i++)
        {
            fact[i]=(1L*i*fact[i-1])%mod;
            // System.out.println(fact[i]);
        }
        String [] words=s.split(" ");
        long res=1;
        for(String l:words)
        {
            System.out.println(l);
            res=(res*ways(l))%mod;
            // System.out.println(res);
        }
        res%=mod;
        return (int)res;
    }
}