using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int num_1, num_2, act;
            Console.WriteLine("Enter first number: ");
            num_1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            num_2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the action you want to perform: 1.Sum 2.Subtraction 3. Multiplication 4.Division  ");
            act = Convert.ToInt32(Console.ReadLine());
            if (act == 1)
                Sum(num_1, num_2, act);
            else if (act == 2)
                Sub(num_1, num_2, act);
            else if (act == 3)
                Mul(num_1, num_2, act);
            else if (act == 4)
                Div(num_1, num_2, act);
            Console.ReadKey();
        }
        public static void Sum(int num_1, int num_2, int act)
        {
            Console.WriteLine("The result is: " + (num_1 + num_2));
        }
        public static void Sub(int num_1, int num_2, int act)
        {
            Console.WriteLine("The result is: " + (num_1 - num_2));
        }
        public static void Mul(int num_1, int num_2, int act)
        {
            Console.WriteLine("The result is: " + (num_1 * num_2));
        }
        public static void Div(int num_1, int num_2, int act)
        {
            if (num_2 == 0)
                Console.WriteLine("Dividing by zero is impossible");
            else
                Console.WriteLine("The result is: " + (num_1 / num_2));
        }

    }
}
