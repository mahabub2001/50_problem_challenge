#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        int arr[n];
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        int flag=1;
        int x=0,p,s=0;
        int size=n-1;
        int i=0;
        while(i!=n)
        {
            if((arr[i]+x)>=k)
            {
                flag=1;
                x+=(arr[i]-k);
            }
            else
            {
                flag=0;
                //break;
                p=i;
                break;

            }
            i++;
            s++;
        }
        cout<<s<<endl;
        if(flag==1)
        {
            cout<<"YES"<<endl;
        }
        else
        {
            cout<<"NO"<<" "<<p+1<<endl;
        }
    }
}
