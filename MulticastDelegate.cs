using System;

public delegate void NotifyDelegate();

class Program
{
    static void Welcome() => Console.WriteLine("Welcome to Hacktoberfest!");
    static void Contribute() => Console.WriteLine("Keep contributing to open source!");

    static void Main()
    {
        NotifyDelegate del = Welcome;
        del += Contribute;

        del(); // Calls both methods
    }
}
