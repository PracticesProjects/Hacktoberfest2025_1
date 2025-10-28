using System;

class Program
{
    static int Square(int n) => n * n;

    static void Main()
    {
        Func<int, int> squareFunc = Square;
        Console.WriteLine("Square of 6 is: " + squareFunc(6));
    }
}
