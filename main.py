# project of programming - Bank
# at first we should import our libraries for classes

import random
import numpy as np
import matplotlib.pyplot as plt

# import scipy.integrate as si

k = int(input())  # the number of process, we assume k = 3
n = int(input())  # the number of employees, we suppose n = 5
t = int(input())  # the time of Required, 10 <= t <= 10 ** 5
m = int(input())  # the number of customers, we suppose 100 <= n <= 1000


# create a Function for creating File and Parameter
def parameter_function_generator(txt_1, txt_2, txt_3, txt_4):
    with open(txt_1, 'w+') as data1:
        data1_txt = data1.write('# Distribution_of_time_for_Employee\n'
                                '# first way:\n'
                                'We Have two parameters:\n'
                                'ai & pi : (ai, pi)\n'
                                'The function for Distribution_of_time_for_Employee is:\n'
                                'for each ai: random.randint(1, 60) based on Minute\n'
                                'for each pi: random.randint(1, 100) based on Percent\n'
                                '# second way:\n'
                                '# use the Two-sentence distribution\n'
                                'for each ai: random.randint(1, 60) based on Minute\n'
                                'for each pi:'
                                'n: the number of a'
                                'i: [0, n]'
                                'pi = [n! / ((n - i)! * i!)] * (p ** i) * ((1 - p) ** (n - i))\n')
    with open(txt_2, 'w+') as data2:
        data2_txt = data2.write('# Distribution_of_time_for_Customer\n'
                                'We have three parameters:\n'
                                'T1 & T2 & D:\n'
                                'for each T1 and T2: random.randint(1, 60) based on Minute\n'
                                'we sort the T1 & T2: list_time = [T1, T2] & list_time.sort()\n'
                                'D = max(list_time) - min(list_time)\n'
                                'also we have: D = abs(T2 - T1)\n')
    with open(txt_3, 'w+') as data3:
        data3_txt = data3.write('# Probability_of_customer_Process\n'
                                '# first Assumption:\n'
                                '# use the Two-sentence distribution\n'
                                'we have a Probabilistic list & two parameters (n & p):\n'
                                'i in range [0, n] which n is the number of process\n'
                                'we need a random.random() function\n'
                                'for each parameters(constant): p = random.random()\n'
                                'Two-entence distribution: pi = [n! / ((n - i)! * i!)] * (p ** i) * ((1 - p) ** (n - i))\n'
                                'for each i in [0, n] we use Two-sentence distribution\n'
                                '# second Assumption:\n'
                                'we have a Probabilistic list & one parameter\n'
                                'i in range [0, n] which n is the number of process\n'
                                'we need a random.random() function\n'
                                'for each i: pi = random.random()\n'
                                '!attention! in this way perhaps the Sum of pi don"t equal 1\n')
    with open(txt_4, 'w+') as data4:
        data4_txt = data4.write('# Distribution_of_Money\n'
                                'We have Three parameters:\n'
                                ' D = Standard deviation & M = Average  & x = Money\n'
                                'so the function for normal distribution is:\n'
                                'f(x) = [1 / (((2 * pi) ** 0.5) * D)] * [exp(-(x - M) ** 2 / (2 * ( D ** 2))]\n'
                                'f(x) = der(F(x)) : f(x) = dF(x)/dx\n'
                                'M = int(x * f(x), - inf, inf)\n'
                                'D = [int(((x - M) ** 2) * f(x), - inf, inf)] ** 0.5\n'
                                'f(x) = random.random()\n'
                                'we consider a range for R: (-10, 10)\n'
                                'F(x) = int(f(x), -inf, x)\n'
                                'we assume M = 0 & F(0) = 0.5\n'
                                'if x > 0 :\n'
                                '    di = (x / 100) & Xn = din + di, si = f(Xi) * di\n'
                                '    F(x) = 0.5 + Sum(si)\n'
                                'if x < 0:\n'
                                '    di = (x / 100) & Xn = din + di, si = f(Xi) * di\n'
                                '    F(x) = 0.5 - Sum(si, 0, n)\n'
                                'We assume F(10) = 1 & F(-10) = 0:\n'
                                'Now we use binary search:\n'
                                'num = [0.00, 0.05, 0.10, 0.15, 0.20,\n'
                                '       0.25, 0.30, 0.35, 0.40, 0.45, 0.50,\n'
                                '        0.55, 0.60, 0.65, 0.70, 0.75,\n'
                                '        0.80, 0.85, 0.90, 0.95, 1.00]\n'
                                'for calculate X we should consider x = int(f(x) * 10) / 10 &\n'
                                'u = [int(f(x) * 100) % 10] * 0.1\n'
                                'def binary_search(x, num, low, high): x, low = F(-10), high = F(10)\n'
                                'if low >= high:\n'
                                'return -1\n'
                                'mid = (low + high) // 2\n'
                                'if num[mid] == x:\n'
                                'return mid\n'
                                'elif num[mid] > x:\n'
                                'return binary_search(x, num, low, mid)\n'
                                'else:\n'
                                'return binary_search(x, num, mid+1, high)\n'
                                'X = binary_search(f(x), num, -1, 1) + u\n')


parameter_function_generator('Distribution_of_time_for_Employee.txt',
                             'Distribution_of_time_for_Customer.txt',
                             'Probability_of_customer_Process.txt',
                             'Distribution_of_Money.txt')


class ParameterLoader:
    def __init__(self):
        self.p = 0
        self.a = 0
        self.T1 = 0
        self.T2 = 0
        self.pi = 0
        self.x = 0
        self.f_x = 0

    def distribution_of_time_for_employee(self):
        try:
            txt_1 = open('Distribution_of_time_for_Employee.txt', 'r+')
            function = txt_1.read()  # we read the function and operation
            self.a = random.randint(1, 60)  # a is time (base on minute)
            self.p = random.randint(1, 100)  # p is Probability of Process (based on percent)
        except IOError:
            return 'None'
        else:
            return self.a, self.p
        finally:
            txt_1.close()

    def distribution_of_time_for_customer(self):
        try:
            txt_2 = open('Distribution_of_time_for_Customer.txt', 'r+')
            function = txt_2.read()  # we read the function and operation
            self.T1 = random.randint(1, 60)  # T1 is the time of first entry (base on minute)
            self.T2 = random.randint(1, 60)  # T2 is the time of second entry  (base on minute)
        except IOError:
            return 'None'
        else:
            return self.T1, self.T2
        finally:
            txt_2.close()

    def probability_of_customer_process(self, n, i):
        try:
            txt_3 = open('Probability_of_customer_Process.txt', 'r+')
            function = txt_3.read()  # we read the function and operation
            self.p = random.random()  # we use Two-sentence distribution

            def factorial(n):
                if n <= 1:
                    return 1
                return n * factorial(n - 1)

            self.pi = float(factorial(n) / (factorial(n - i) * factorial(i))) * (self.p ** i) * (
                    (1 - self.p) ** float(n - i))  # pi is the Probability of customer Process number i
        except IOError:
            return 'None'
        else:
            return self.pi
        finally:
            txt_3.close()

    def distribution_of_money(self):
        try:
            txt_4 = open('Distribution_of_Money.txt', 'r+')
            function = txt_4.read()  # we read the function and operation
            self.f_x = random.random()  # f_x is the normal distribution
            x = int(self.f_x * 10) / 10  # we consider the f_x based on Two decimal places
            u = float(int(self.f_x * 100) % 10) * 0.1  # we add the u at the end of calculation to self.x(money)
            num = [0.00, 0.05, 0.10, 0.15, 0.20,
                   0.25, 0.30, 0.35, 0.40, 0.45, 0.50,
                   0.55, 0.60, 0.65, 0.70, 0.75,
                   0.80, 0.85, 0.90, 0.95, 1.00]
            # we can use:
            # def binary_search(x, num, low, high):
            #     if low >= high:
            #         return -1
            #     mid = (low + high) // 2
            #     if num[mid] == x:
            #         return mid
            #     elif num[mid] > x:
            #         return binary_search(x, num, low, mid)
            #     else:
            #         return binary_search(x, num, mid + 1, high)
            # or:
            self.x = num.index(x) - 10
            self.x += u
        except IOError:
            return 'None'
        else:
            return self.x, self.f_x
        finally:
            txt_4.close()

    def save_information(self):
        print('C:/Users/asus/PycharmProjects/pythonProject30')  # address of information files


class RandomGenerator:
    def __init__(self):
        self.L = []
        self.p = 0
        self.a = 0
        self.T1 = 0
        self.T2 = 0
        self.pi = 0
        self.x = 0
        self.D = 0
        self.f_x = 0

    def distribution_of_time_for_employee(self, n, k):  # n is Employee number and k is Process number
        self.p = random.randint(1, 100)  # p is Probability of Process (based on percent)
        self.a = random.randint(1, 60)  # a is time (base on minute)
        self.L = [(self.a, self.p)]
        Sum = self.p
        # while Sum < 100:
        # self.a = random.randint(1, 60)
        # self.p = random.randint(1, 100)
        # self.L.append((self.a, self.p))
        Sum += self.p
        return self.L

    def distribution_of_time_for_customer(self, b,
                                          c):  # b is the  first Customer number & c is the second Customer number
        self.T1 = random.randint(1, 60)  # T1 is the time of first entry (base on minute)
        self.T2 = random.randint(1, 60)  # T2 is the time of second entry  (base on minute)
        self.D = abs(self.T2 - self.T1)
        return self.D  # D is the time distance

    def probability_of_customer_process(self, n, k):  # n is the Customer number and k is Process number
        self.p = random.random()  # we use Two-sentence distribution

        def factorial(k):
            if k <= 1:
                return 1
            return k * factorial(k - 1)

        self.L = []
        for i in range(k):
            self.pi = float(factorial(k) / (factorial(k - i) * factorial(i))) * (self.p ** i) * (
                    (1 - self.p) ** float(n - i))  # pi is the Probability of customer Process number i
            self.L.append((i, self.pi))
        return self.L

    def distribution_of_money(self, n):  # n is the Customer number
        self.f_x = random.random()  # f_x is the normal distribution
        x = int(self.f_x * 10) / 10  # we consider the f_x based on Two decimal places
        u = float(int(self.f_x * 100) % 10) * 0.1  # we add the u at the end of calculation to self.x(money)
        num = [0.00, 0.05, 0.10, 0.15, 0.20,
               0.25, 0.30, 0.35, 0.40, 0.45, 0.50,
               0.55, 0.60, 0.65, 0.70, 0.75,
               0.80, 0.85, 0.90, 0.95, 1.00]
        self.x = num.index(x) - 10
        self.x += u
        return self.x, self.f_x


class Queue:
    def __init__(self, n=0):  # t is the time and n is the number of customers
        self.n = 0

    def enqueue(self, n):
        self.n += 1
        return self.n

    def dequeue(self, n):
        self.n -= 1
        return self.n


class Customer:
    def __init__(self):
        self.t1 = 0  # the time of entry
        self.t2 = 0  # the time of waiting
        self.t3 = 0  # the time of process
        self.t4 = 0  # the time of exit
        self.n = 0  # the number of employee
        self.k = 0  # the kind of process
        self.T1 = 0  # first time
        self.T2 = 0  # second time
        self.T = []
        self.D = 0
        self.P = []

    def time(self, m):  # m is the number of customers
        self.T = [0]
        for i in range(m):
            if i == 0:
                self.T1 = 0
                self.T2 = random.randint(1, 60)
                self.D = self.T2
                self.T.append(self.D)
            else:
                self.T2 = random.randint(1, 60)
                self.D += self.T2
                self.T.append(self.D)

        return self.T  # the list of entry time

    def process(self):
        for i in range(m):
            a = RandomGenerator()
            b = a.probability_of_customer_process(i, 2)  # 2 is the number of process
            q = random.random()
            for t in b:
                if int(t[1]) <= q:
                    self.P.append((i, t[0], t[1]))
                    break
            return self.P  # the list of customer number & kind of process & probability of customer process


class Employee:
    def __init__(self):
        self.P = []  # the list of process & Time
        self.n = 0  # the employee number
        self.p = 0  # the kind of process
        self.q = []  # final list of process

    def time_and_process(self, n, k):  # n: the number of employees & k: the number of process
        a = RandomGenerator()
        for i in range(n):
            for t in range(k):
                b = a.distribution_of_time_for_employee(i, t)
                self.P.append([i, t, b])
        # q = random.random()  # a random count for probability of each process
        # for i in range(n):
        #     for t in range(k):
        #         for h in self.P[i][t][2]:
        #             if int(h[1]) <= q:
        #                 self.q.append([i, t, h[0], h[1]])  # now we choose the probability of process

        return self.P


# we consider three process: 1. the payment  2. harvest  3. open an account
# if number of process is 1 or 3: we use distribution of money (in the Simulation, equal to numbers 0 & 2!)

# based on three Strategy
# 1 Assign the customer to an employee who, on average, spends less time on the customer's intended process:

class Simulation1:
    def __init__(self):
        self.wait = 0
        self.freedom = 0
        self.entry = 0  # the probability of entry for each customer after constrained time is: 0
        self.money = 0

    def employee_customer(self, z):  # z: the number of customers
        aa = RandomGenerator()
        a = Employee()
        b = a.time_and_process(5, 2)  # 5 is the number of employees & 2 is the number of process
        c = Customer()
        d = c.time(z)  # z is the number of customers
        e = c.process()
        o = 0  # the number of Busy employees
        nn = 1  # the parameter for index in list d (distribution_of_time_for_customer)
        self.wait = 0
        self.freedom = d[0]
        for t in e:
            if self.wait == 0:
                g = random.randint(1, 5)  # for the first step we have equal chance for employees
                if t[1] == 0:
                    for i in b:
                        if i[0] == g and i[1] == 0:
                            k = i  # k is a list: [i, t, h[0], h[1]] i = number of employee/
                            # t = kind of process/ h[0] = time/  h[1] = probability
                            self.wait += i[2][0][0]
                            self.freedom += d[nn]
                            aaa = aa.distribution_of_money(t[0])
                            # ff = random.random()
                            # if aaa[2] <= ff:
                            self.money += abs(aaa[0])
                            break
                elif t[1] == 1:
                    for i in b:
                        if i[0] == g and i[1] == 1:
                            self.wait += i[2][0][0]
                            self.freedom += d[nn]
                            break
                elif t[1] == 2:
                    for i in b:
                        if i[0] == g and i[1] == 2:
                            self.wait += i[2][0][0]
                            self.freedom += d[nn]
                            aaa = aa.distribution_of_money(t[0])
                            # ff = random.random()
                            # if aaa[2] <= ff:
                            self.money += abs(aaa[0])
                            break
            else:
                if o <= 5:
                    g = random.randint(1, 5)  # for the first step we have equal chance for employees
                    if t[1] == 0:
                        for i in b:
                            if i[0] == g and i[1] == 0:
                                k = i  # k is a list: [i, t, h[0], h[1]] i = number of employee/
                                # t = kind of process/ h[0] = time/  h[1] = probability
                                self.wait += k[2][0][0]
                                self.freedom += d[nn]
                                aaa = aa.distribution_of_money(t[0])
                                # ff = random.random()
                                # if aaa[2] <= ff:
                                self.money += abs(aaa[0])
                                break
                    elif t[1] == 1:
                        for i in b:
                            if i[0] == g and i[1] == 1:
                                self.wait += i[2][0][0]
                                self.freedom += d[nn]
                                break
                    elif t[1] == 2:
                        for i in b:
                            if i[0] == g and i[1] == 2:
                                self.wait += i[2][0][0]
                                self.freedom += d[nn]
                                aaa = aa.distribution_of_money(t[0])
                                # ff = random.random()
                                # if aaa[2] <= ff:
                                self.money += abs(aaa[0])
                                break
                else:
                    if t[1] == 0:
                        mini = []
                        for i in b:
                            if i[1] == 0:
                                mini.append(i[2])
                        for i in b:
                            if i[2] == min(mini):
                                self.wait += i[2][0][0]
                                self.freedom += d[nn]
                                aaa = aa.distribution_of_money(t[0])
                                # ff = random.random()
                                # if aaa[2] <= ff:
                                self.money += abs(aaa[0])
                                break
                    elif t[1] == 1:
                        mini = []
                        for i in b:
                            if i[1] == 1:
                                mini.append(i[2])
                        for i in b:
                            if i[2] == min(mini):
                                self.wait += i[2][0][0]
                                self.freedom += d[nn]
                                break
                    elif t[1] == 2:
                        mini = []
                        for i in b:
                            if i[1] == 2:
                                mini.append(i[2])
                        for i in b:
                            if i[2] == min(mini):
                                self.wait += i[2][0][0]
                                self.freedom += d[nn]
                                aaa = aa.distribution_of_money(t[0])
                                # ff = random.random()
                                # if aaa[2] <= ff:
                                self.money += abs(aaa[0])
                                break
            o += 1
            nn += 1
        self.wait /= z
        self.freedom /= z
        return self.wait, self.freedom


v = Simulation1()
data = []
# data = v.employee_customer(z)
for i in range(100, 1001):
    data.append(v.employee_customer(i))
# print(data)
wait = []
freedom = []
for i in data:
    wait.append(i[0])
for i in data:
    freedom.append(i[1])
wait.sort()
freedom.sort()
# print(wait)
# print(freedom)
D = int(input())
size = len(wait)
x = np.array(wait)
y = np.sin(x) + np.random.randn(size)
degree = D  # we assume a normal distribution
t = np.polyfit(x, y, degree)
z = np.polyval(t, x)
plt.plot(x, y, '*')
plt.plot(x, z)
plt.legend(['Average OF Time', 'Poly Function'])
plt.show()
size = len(freedom)
x = np.array(freedom)
y = np.sin(x) + np.random.randn(size)  # we consider a function
degree = D  # if we assume a normal distribution: D = 2
t = np.polyfit(x, y, degree)
z = np.polyval(t, x)
plt.plot(x, y, '*')
plt.plot(x, z)
plt.legend(['Average OF Time', 'Poly Function'])
plt.show()
