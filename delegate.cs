public delegate void MyDelegate(string msg);

class Program {
    static void Print(string message) => Console.WriteLine(message);
    static void Main() {
        MyDelegate del = Print;
        del("Hello, Delegate!");
    }
}
