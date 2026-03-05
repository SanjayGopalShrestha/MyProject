from tkinter import *



# globally declare the expression variable 
expression = ""



def press(x): 
    x=int(input())
    y=int(input())
    print (x+y)



# Function to clear the contents 
# of text entry box 
def clear(): 
    global expression 
    expression = "" 
    equation.set("") 



# Driver code 
if __name__ == "__main__": 
    # create a GUI window 
    x = Tk()
    x.configure(background="silver")
    x.title("Scalable Calculator")
    x.geometry("250x250")

    
  
    # create a Buttons and place at a particular 
    # location inside the root window . 
    # when user press the button, the command or 
    # function affiliated to that button is executed . 
    b=Button(x, text='+', fg='black', bg='silver', height=1, width=7, command=lambda: press())
    b.grid(row=2, column=0)

    b=Button(x, text='2', fg='black', bg='silver', height=1, width=7, command=lambda: press(2))
    b.grid(row=2, column=1)


    multiply = Button(x, text=' * ', fg='white', bg='red', command=lambda: press("*"), height=1, width=7) 
    multiply.grid(row=2, column=2) 

    clear = Button(x, text='Clear', fg='white', bg='red', command=clear, height=1, width=7) 
    clear.grid(row=5, column='1') 



    # start the GUI 
    x.mainloop() 
