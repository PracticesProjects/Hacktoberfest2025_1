class Alarm {
    public event Action OnRing;

    public void Ring() {
        OnRing?.Invoke();
    }
}

class Program {
    static void Main() {
        Alarm alarm = new Alarm();
        alarm.OnRing += () => Console.WriteLine("Wake up!");
        alarm.Ring();
    }
}
