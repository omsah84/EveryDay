class userclass
{
public:
    userclass()
    {
        #ifndef ONLINE_JUDEGE
        freopen("input.txt", "r", stdin);
        freopen("output.txt", "w", stdout);
        #endif
    }
};