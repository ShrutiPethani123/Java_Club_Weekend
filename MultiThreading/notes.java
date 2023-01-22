/*

-> MultiTasking
-> MultiProcessing
-> MultiThreading

1. Multi Tasking : performing multi task at single time

example-> VLC , Word , browser


use: Increase perfomance of CPU

How to achive MultiTsaking
-> MultiProcessing -> Process based MultiTasking
-> MultiThreading -> Thread based multiTasking


2. Multi Processing: when one system is connected to multiple processor in order to complete task.

        VLC         Word        Browser
        |           |               |
                    OS
                    |

        CPU         CPU             CPU

        -> Os level

3. Multi Threading: Executing multi thread at same time

    VLC (Process)
    -> video
    -> music
    -> Timer
    -> progress bar


    use:
    Game
    software
    animation


    Process                                             Thread

    1. A program which is in excuting state             1. It is subpart of process
    2. Heavy weighted                                   2. light Weighted
    3. context switching take more time                 3. context switching take less time 
    4. Intercommunication takes more time               4. Intercommunication takes less time
    5. each process have different address space        5. each Thread have same address space
    6. does not dependent to each other                 6. dependent to each other
    7. creation time is more                            7. creation time is less


-> Creating Thread

1. using Thread class
2. using Runnable interface


-> Runnable interface

package java.lang;
interface Runnable{

    void run(); // public abstarct
}


-> Thread class

package java.lang;
class Thread implements Runnable{

    Thread(Runnable r)
    {

    }

    public void run()
    {

    }

    public void start()
    {
        
    }
}

-> steps for create thread using Thread class

1. extends Thread class
2. overide run Method
3. Make object of that class
4. invoke run method using start method(invoke thread)


-> steps for create thread using Runnable imterface

1. implements Runnable interface
2. overide run Method
3. Make object of that class
4. passing object in thread class object
5. invoke run method using start method(invoke thread)

-> Life cycle of thread
3.     4.
Create ---> Runnable --> Running ---> Dead
            \           /
              non Runnable 
              state


-> Which is better option runnable interface or Thread class ? -> Runnable interface
-> why ?


    class A extends B, Thread{
                -> Invalid
    }

    class A implements Runnable , extend B{
                       -> valid
    }


 */