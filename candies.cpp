#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int size=2*n;
        int arr[size];
        for(int i=0;i<size;i++)
        {
            cin>>arr[i];
        }

        sort(arr,arr+size);
        int i=0;
        int s=0,m=0;
        while(i!=size)
        {
            if(arr[i]==arr[i+1])
            {
                s++;
                if(s>m)
                {
                    m=s;
                }
            }
            else
            {
                s=0;
            }
            i++;
        }
        if(m+1>2)
        {
            cout<<"NO"<<endl;
        }
        else
        {
            cout<<"YES"<<endl;
        }
    }
}
