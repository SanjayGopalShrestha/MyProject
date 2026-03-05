/* 
To Run
======
XAMPP Control Panel
Apache Start
MySQL Start
*/

import time
# at the beginning:
start_time = time.time()


import tkinter

import webbrowser

from tkinter.filedialog import asksaveasfile 

import mysql.connector

conn=mysql.connector.connect(host="localhost",user="root",passwd="")
print("Successfully connected to MySql database server!")

from tkinter.filedialog import askopenfile

from PIL import ImageTk,Image

# importing datetime module for now()  
from datetime import *

import time


def exit():
    a.destroy()



#Frame2 web links start
new = 1
url1 = "https://www.arkadium.com/free-online-games/"
url2 = "https://downloads.digitaltrends.com/windows-media-player/windows"
url3 = "https://adobe-reader.soft112.com/download.html"
url4 = "https://www.google.com/maps"
url5 = "https://www.linkedin.com"
url6 = "https://www.blogger.com/about/?bpli=1"
url7 = "https://en.wikipedia.org/wiki/Main_Page"
url8 = "https://www.dropbox.com/?landing=dbv2"
url9 = "https://translate.google.com/"
#url10 = "E:\Python CBSE XII\tkinter\notepad.py"
url11 = "https://www.myfitnesspal.com/"
url12 = "https://www.dictionary.com/"
url13 = "https://www.grammarly.com/"
url14 = "https://www.google.com/"
url15 = "https://download.cnet.com/"
url16="http://localhost/phpmyadmin/"
#Frame2 web links start




#Weblinks methods for frame2 starts
def openweb1():
    webbrowser.open(url1,new=new)


def openweb2():
    webbrowser.open(url2,new=new)


def openweb3():
    webbrowser.open(url3,new=new)


def openweb4():
    webbrowser.open(url4,new=new)


def openweb5():
    webbrowser.open(url5,new=new)

def openweb6():
    webbrowser.open(url6,new=new)


def openweb7():
    webbrowser.open(url7,new=new)


def openweb8():
    webbrowser.open(url8,new=new)


def openweb9():
    webbrowser.open(url9,new=new)


'''def openweb10():
    webbrowser.open(url0,new=new)'''


def openweb11():
    webbrowser.open(url11,new=new)


def openweb12():
    webbrowser.open(url12,new=new)


def openweb13():
    webbrowser.open(url13,new=new)


def openweb14():
    webbrowser.open(url14,new=new)


def openweb15():
    webbrowser.open(url15,new=new)

#weblinks methods for frame2 ends





#Frame3 web links start
url16 = "https://www.zoom.com"
url17 = "https://www.youtube.com"
url18 = "https://www.facebook.com"
url19 = "https://www.twitter.com"
url20 = "https://www.linkedin.com"
#Frame3 web links end






#Weblinks methods for frame3 starts
def openweb16():
    webbrowser.open(url16,new=new)


def openweb17():
    webbrowser.open(url17,new=new)


def openweb18():
    webbrowser.open(url18,new=new)


def openweb19():
    webbrowser.open(url19,new=new)


def openweb20():
    webbrowser.open(url20,new=new)
#weblinks methods for frame3 ends





#Database option in File Menu Start
database = "http://localhost/phpmyadmin/"
python_d="https://www.python.org/downloads/"
xammp_x="https://www.apachefriends.org/index.html"
p_tutorial="https://www.tutorialspoint.com/python/index.htm"
#Database option in Fille Menu End





#menu list methods start


def save(): 
    files = [('All Files', '*.*'),  
             ('Python Files', '*.py'), 
             ('Text Document', '*.txt')] 
    file = asksaveasfile(filetypes = files, defaultextension = files) 




def open_file(): 
    file = askopenfile(mode ='r', filetypes =[('Python Files', '*.py')]) 
    if file is not None: 
        content = file.read() 
        print(content) 



def about():
    a=tkinter.Tk()
    a.title("About")
    #a.iconphoto(True, tkinter.PhotoImage(file="1.ico"))
    a.minsize(350,200)
    a.maxsize(350,200)
    
    frame_about=tkinter.Frame(a, height="150", width="350", bg="#202856")
    frame_about.pack()

    frame_label=tkinter.Label(frame_about, text="Scalable Calculator v1.0\n Developed by Mr. A", bg="#202856", fg="white", font=("dotum", 10, "bold"))
    frame_label.place(x=92, y=47)

    buttom=tkinter.Button(a, height="1", width="7", text="Close", command=a.destroy)
    buttom.place(x=147, y=165)




def software_docs():
    a=tkinter.Tk()
    a.title("Software Documentation")
    #a.iconphoto(True, tkinter.PhotoImage(file="1.ico"))
    a.minsize(1050,850)
    #a.maxsize(350,200)

    #frame_about=tkinter.Frame(a, height="150", width="350", bg="red")
    #frame_about.pack()

    frame_label=tkinter.Label(a, text="Scalable Calculator v1.0\n Developed by Mr. A")
    frame_label.place(x=105, y=47)

    buttom=tkinter.Button(a, height="1", width="7", text="Close", command=a.destroy)
    buttom.place(x=155, y=165)



def database_option():
    webbrowser.open(database,new=new)



def python_download():
    webbrowser.open(python_d,new=new)



def xammp():
    webbrowser.open(xammp_x,new=new)
    


def tutorial():
    webbrowser.open(p_tutorial,new=new)
#weblinks methods for Database option in File Menu end





def python_docs_f1():
    os.startfile("python373.chm")


def notepad():
    os.startfile("notepad.py")

#menu list methods ends




def thanks():
    a=tkinter.Tk()
    a.configure(background="white")
    a.title("Thanks!")
    a.minsize(331,177)
    a.maxsize(331,177)

    frame=tkinter.Frame(a, height="282", width="373", bg="#fec400")
    frame.place(x=0, y=0)

    frame=tkinter.Frame(a, height="47", width="15", bg="#ff80ec")
    frame.place(x=0, y=43)

    frame=tkinter.Frame(a, height="47", width="21", bg="#ff80ec")
    frame.place(x=310, y=0)

    frame=tkinter.Frame(a, height="21", width="21", bg="#ff80ec")
    frame.place(x=292, y=75)

    frame=tkinter.Frame(a, height="21", width="21", bg="#ff7f29")
    frame.place(x=242, y=0)

    frame=tkinter.Frame(a, height="47", width="2", bg="#ff7f29")
    frame.place(x=280, y=71)

    label=tkinter.Label(a, text="Thank You! for using me.\nHave a good day ahead.", fg="#202856", bg="#fec400", font=("helvetica", 10))
    label.place(x=41, y=51)
    
    button=tkinter.Button(a, height="1", width="9", bg="#202856", text="Close", fg="white", font=("helvetica", 9, "bold"), command=a.destroy)
    button.place(x=126, y=135)
    
    a.mainloop()

    


#Calculator Methods Start

expression = "" 

def press(num): 
    global expression 
    expression = expression + str(num) 
    var.set(expression) 

  

  
def equalpress(): 
    try: 
        global expression 
        total = str(eval(expression)) 
        var.set(total) 
        expression = "" 
  
    except: 
        var.set("Error!") 
        expression = "" 


  
  
def clear(): 
    global expression 
    expression = "" 
    var.set("") 


#Calcultor Methods End






'''

def new_calculator():
    frame1=tkinter.Frame(a, height="175", width="175", bg="#6e6d8d")
    frame1.place(x=0,y=0)


    frame5=tkinter.Frame(frame1)
    frame5.place(x=2, y=0)
    var = tkinter.StringVar()

    expression_field = tkinter.Entry(frame5, textvariable=var)
    #NOTE: Here in Entry box textvariable must be used, where as in dropdown list (OptionMenu) only var could be used.
    expression_field.pack(ipady="5", ipadx="23")
    #NOTE: ipady helps to increase the height of the entry box and ipadx helps to increase the length of the text box
    var.set("") 

  
    frame6=tkinter.Frame(frame1, bg="#6e6d8d", height="150", width="175")
    frame6.place(x=2, y=26)

    button1 = tkinter.Button(frame6, text=' 1 ', fg='white', image=photo1, command=lambda: press(1), height="29", width="35", compound="center") 
    button1.grid(row=2, column=0)

    button2 = tkinter.Button(frame6, text=' 2 ', fg='white', image=photo1, command=lambda: press(2), height="29", width="35", compound="center") 
    button2.grid(row=2, column=1) 
  
    button3 = tkinter.Button(frame6, text=' 3 ', fg='white', image=photo1, command=lambda: press(3), height="29", width="35", compound="center") 
    button3.grid(row=2, column=2) 
  
    button4 = tkinter.Button(frame6, text=' 4 ', fg='white', image=photo1, command=lambda: press(4), height="29", width="35", compound="center") 
    button4.grid(row=3, column=0) 
  
    button5 = tkinter.Button(frame6, text=' 5 ', fg='white', image=photo1, command=lambda: press(5), height="29", width="35", compound="center") 
    button5.grid(row=3, column=1)

    button6 = tkinter.Button(frame6, text=' 6 ', fg='white', image=photo1, command=lambda: press(6), height="29", width="35", compound="center") 
    button6.grid(row=3, column=2) 
  
    button7 = tkinter.Button(frame6, text=' 7 ', fg='white', image=photo1, command=lambda: press(7), height="29", width="35", compound="center") 
    button7.grid(row=4, column=0) 
  
    button8 = tkinter.Button(frame6, text=' 8 ', fg='white', image=photo1, command=lambda: press(8), height="29", width="35", compound="center") 
    button8.grid(row=4, column=1) 
  
    button9 = tkinter.Button(frame6, text=' 9 ', fg='white', image=photo1, command=lambda: press(9), height="29", width="35", compound="center") 
    button9.grid(row=4, column=2) 
  
    button0 = tkinter.Button(frame6, text=' 0 ', fg='white', image=photo1, command=lambda: press(0), height="29", width="35", compound="center") 
    button0.grid(row=5, column=0) 
  
    plus = tkinter.Button(frame6, text=' + ', fg='white', image=photo1, command=lambda: press("+"),  height="29", width="35",compound="center") 
    plus.grid(row=2, column=3) 
  
    minus = tkinter.Button(frame6, text=' - ', fg='white', image=photo1, command=lambda: press("-"), height="29", width="35", compound="center") 
    minus.grid(row=3, column=3) 
  
    multiply = tkinter.Button(frame6, text=' * ', fg='white', image=photo1, command=lambda: press("*"), height="29", width="35", compound="center")
    multiply.grid(row=4, column=3) 

    divide = tkinter.Button(frame6, text=' / ', fg='white', image=photo1, command=lambda: press("/"), height="29", width="35", compound="center") 
    divide.grid(row=5, column=3) 
  
    equal = tkinter.Button(frame6, text=' = ', fg='white', image=photo1, command=equalpress, height="29", width="35", compound="center")
    equal.grid(row=5, column=2) 
  
    clear = tkinter.Button(frame6, text='C', fg='white', image=photo1, command=clear, height="29", width="35", compound="center") 
    clear.grid(row=5, column='1')

    a.mainloop()
'''






#Time Method Start 

time1=''
def tick():
    global time1
    # get the current local time from the PC
    time2 = time.strftime('%H:%M:%S')
    # if time string has changed, update it
    if time2 != time1:
        time1 = time2
        l4_3.config(text=time2)
    # calls itself every 200 milliseconds
    # to update the time display as needed
    # could use >200 ms, but display gets jerky
    l4_3.after(200, tick)

#Time Method End




#main window setting open

a=tkinter.Tk()
a.title("Scalable v1.0")
a.iconphoto(True, tkinter.PhotoImage(file="LOGO1.ico"))
a.minsize(350,350)
a.maxsize(350,350)

#main window setting close




#Frame1 Images Start
photo1=tkinter.PhotoImage(file="frame11_button.png")
#Frame1 Images End




#Frame2 Images Start
photo2=tkinter.PhotoImage(file="frame21_1.png")
photo3=tkinter.PhotoImage(file="frame21_2.png")
photo4=tkinter.PhotoImage(file="frame22_3.png")
photo5=tkinter.PhotoImage(file="frame22_4.png")
photo6=tkinter.PhotoImage(file="frame22_5.png")
photo7=tkinter.PhotoImage(file="frame22_6.png")
photo8=tkinter.PhotoImage(file="frame22_7.png")
photo9=tkinter.PhotoImage(file="frame22_8.png")
photo10=tkinter.PhotoImage(file="frame22_9.png")
photo11=tkinter.PhotoImage(file="frame22_10.png")
photo12=tkinter.PhotoImage(file="frame22_11.png")
photo13=tkinter.PhotoImage(file="frame22_12.png")
photo14=tkinter.PhotoImage(file="frame22_13.png")
photo15=tkinter.PhotoImage(file="frame22_14.png")
photo16=tkinter.PhotoImage(file="frame22_15.png")
#Frame2 Images End




#Frame3 Images Start
photo28=tkinter.PhotoImage(file="frame31.png")
photo17=tkinter.PhotoImage(file="frame3_1.png")
photo18=tkinter.PhotoImage(file="rough.png")
photo19=tkinter.PhotoImage(file="rough1.png")
photo20=tkinter.PhotoImage(file="rough2.png")
photo21=tkinter.PhotoImage(file="rough3.png")
photo22=tkinter.PhotoImage(file="rough4.png")
photo23=tkinter.PhotoImage(file="frame3_7.png")
#Frame3 Images End




#Frame4 Images Start
photo24=tkinter.PhotoImage(file="frame_rough1.png")
photo25=tkinter.PhotoImage(file="frame41_2.png")
photo26=tkinter.PhotoImage(file="frame4_3.png")
photo27=tkinter.PhotoImage(file="frame41_4.png")
photo29=tkinter.PhotoImage(file="frame4_5.png")
photo30=tkinter.PhotoImage(file="frame4_6.png")
photo31=tkinter.PhotoImage(file="frame4_7.png")
photo32=tkinter.PhotoImage(file="frame4_8.png")
photo33=tkinter.PhotoImage(file="frame4_9.png")
photo34=tkinter.PhotoImage(file="frame4_10.png")
#Frame4 Images End




#Menu Start

menu1=tkinter.Menu(a)
a.config(menu=menu1)

filemenu=tkinter.Menu(menu1, tearoff=1)
menu1.add_cascade(label="File", menu=filemenu)
filemenu.add_command(label="New", command= lambda: new_calculator())
filemenu.add_command(label="Save", command= lambda: save())
filemenu.add_command(label="Open", command= lambda: open_file())
filemenu.add_command(label="Database", command=lambda: database_option())
filemenu.add_command(label="Close   Alt+F4", command= lambda: exit())
filemenu.add_separator()
filemenu.add_command(label="Exit", command=a.destroy)

helpmenu=tkinter.Menu(menu1, tearoff=0)
menu1.add_cascade(label="Help", menu=helpmenu)
helpmenu.add_command(label="About", command=about)
helpmenu.add_command(label="Source Code", command=software_docs)
helpmenu.add_command(label="Library", command=software_docs)
helpmenu.add_command(label="Python Download", command=python_download)
helpmenu.add_command(label="XAMMP Download", command=xammp)
helpmenu.add_command(label="Python Tutorial", command=tutorial)
helpmenu.add_separator()
helpmenu.add_command(label="Python Docs F1",command=python_docs_f1)

#Menu End





#frame1 top boundry

frame1=tkinter.Frame(a, height="175", width="175", bg="#6e6d8d")
frame1.place(x=0,y=0)


frame5=tkinter.Frame(frame1)
frame5.place(x=2, y=0)
var = tkinter.StringVar()

expression_field = tkinter.Entry(frame5, textvariable=var)
#NOTE: Here in Entry box textvariable must be used, where as in dropdown list (OptionMenu) only var could be used.
expression_field.pack(ipady="5", ipadx="23")
#NOTE: ipady helps to increase the height of the entry box and ipadx helps to increase the length of the text box
var.set("") 

  
frame6=tkinter.Frame(frame1, bg="#6e6d8d", height="150", width="175")
frame6.place(x=2, y=26)

button1 = tkinter.Button(frame6, text=' 1 ', fg='white', image=photo1, command=lambda: press(1), height="29", width="35", compound="center") 
button1.grid(row=2, column=0)

button2 = tkinter.Button(frame6, text=' 2 ', fg='white', image=photo1, command=lambda: press(2), height="29", width="35", compound="center") 
button2.grid(row=2, column=1) 
  
button3 = tkinter.Button(frame6, text=' 3 ', fg='white', image=photo1, command=lambda: press(3), height="29", width="35", compound="center") 
button3.grid(row=2, column=2) 
  
button4 = tkinter.Button(frame6, text=' 4 ', fg='white', image=photo1, command=lambda: press(4), height="29", width="35", compound="center") 
button4.grid(row=3, column=0) 
  
button5 = tkinter.Button(frame6, text=' 5 ', fg='white', image=photo1, command=lambda: press(5), height="29", width="35", compound="center") 
button5.grid(row=3, column=1)

button6 = tkinter.Button(frame6, text=' 6 ', fg='white', image=photo1, command=lambda: press(6), height="29", width="35", compound="center") 
button6.grid(row=3, column=2) 
  
button7 = tkinter.Button(frame6, text=' 7 ', fg='white', image=photo1, command=lambda: press(7), height="29", width="35", compound="center") 
button7.grid(row=4, column=0) 
  
button8 = tkinter.Button(frame6, text=' 8 ', fg='white', image=photo1, command=lambda: press(8), height="29", width="35", compound="center") 
button8.grid(row=4, column=1) 
  
button9 = tkinter.Button(frame6, text=' 9 ', fg='white', image=photo1, command=lambda: press(9), height="29", width="35", compound="center") 
button9.grid(row=4, column=2) 
  
button0 = tkinter.Button(frame6, text=' 0 ', fg='white', image=photo1, command=lambda: press(0), height="29", width="35", compound="center") 
button0.grid(row=5, column=0) 
  
plus = tkinter.Button(frame6, text=' + ', fg='white', image=photo1, command=lambda: press("+"),  height="29", width="35",compound="center") 
plus.grid(row=2, column=3) 
  
minus = tkinter.Button(frame6, text=' - ', fg='white', image=photo1, command=lambda: press("-"), height="29", width="35", compound="center") 
minus.grid(row=3, column=3) 
  
multiply = tkinter.Button(frame6, text=' * ', fg='white', image=photo1, command=lambda: press("*"), height="29", width="35", compound="center")
multiply.grid(row=4, column=3) 

divide = tkinter.Button(frame6, text=' / ', fg='white', image=photo1, command=lambda: press("/"), height="29", width="35", compound="center") 
divide.grid(row=5, column=3) 
  
equal = tkinter.Button(frame6, text=' = ', fg='white', image=photo1, command=equalpress, height="29", width="35", compound="center")
equal.grid(row=5, column=2) 
  
clear = tkinter.Button(frame6, text='C', fg='white', image=photo1, command=clear, height="29", width="35", compound="center") 
clear.grid(row=5, column='1') 

#frame1 buttom boundry







#frame2 top boundry

frame2=tkinter.Frame(a, height="175", width="175", bg="#6b6ce6")
frame2.place(x=175,y=0)

b2_1=tkinter.Button(frame2, image=photo2, height="23", width="23", bd="0", relief="sunken", command=openweb1)
b2_1.place(x=57, y=10)

#l2_1=tkinter.Label(frame2, text="Game", font=("Helvetica", 7), fg="white", bg="#6b6ce6")
#l2_1.place(x=27, y=42)

b2_2=tkinter.Button(frame2, image=photo3, height="23", width="23", bd="0", relief="sunken", command=openweb2)
b2_2.place(x=97, y=10)

#l2_2=tkinter.Label(frame2, text="Media", fg="white", bg="#6b6ce6")
#l2_2.place(x=59, y=77)

b2_3=tkinter.Button(frame2, image=photo4, height="23", width="23", bd="0", relief="sunken", command=openweb3)
b2_3.place(x=37, y=45)

b2_4=tkinter.Button(frame2, image=photo5, height="23", width="23", bd="0", relief="sunken", command=openweb4)
b2_4.place(x=71, y=45)

b2_5=tkinter.Button(frame2, image=photo6, height="23", width="23", bd="0", relief="sunken", command=openweb5)
b2_5.place(x=105, y=45)

b2_6=tkinter.Button(frame2, image=photo7, height="23", width="23", bd="0", relief="sunken", command=openweb6)
b2_6.place(x=139, y=37)

b2_7=tkinter.Button(frame2, image=photo8, height="23", width="23", bd="0", relief="sunken", command=openweb7)
b2_7.place(x=10, y=79)

b2_8=tkinter.Button(frame2, image=photo9, height="23", width="23", bd="0", relief="sunken", command=openweb8)
b2_8.place(x=45, y=79)

b2_9=tkinter.Button(frame2, image=photo10, height="23", width="23", bd="0", relief="sunken", command=openweb9)
b2_9.place(x=79, y=79)

b2_10=tkinter.Button(frame2, image=photo11, height="23", width="23", bd="0", relief="sunken", command=notepad)
b2_10.place(x=139, y=71)

b2_11=tkinter.Button(frame2, image=photo12, height="23", width="23", bd="0", relief="sunken", command=openweb11)
b2_11.place(x=33, y=113)

b2_12=tkinter.Button(frame2, image=photo13, height="23", width="23", bd="0", relief="sunken", command=openweb12)
b2_12.place(x=67, y=113)

b2_13=tkinter.Button(frame2, image=photo14, height="23", width="23", bd="0", relief="sunken", command=openweb13)
b2_13.place(x=101, y=113)

b2_14=tkinter.Button(frame2, image=photo15, height="23", width="23", bd="0", relief="sunken", command=openweb14)
b2_14.place(x=137, y=103)

b2_15=tkinter.Button(frame2, image=photo16, height="23", width="23", bd="0", relief="sunken", command=openweb15)
b2_15.place(x=137, y=137)

#frame2 buttom boundry






#frame3 top boundry

frame3=tkinter.Frame(a, height="175", width="175", bg="blue")
frame3.place(x=0,y=175)


label1=tkinter.Label(frame3, image=photo28, height="175", width="175")
label1.place(x=0, y=0)


b3_1=tkinter.Button(frame3, image=photo23, height="15", width="155", bd="0", relief="sunken")
b3_1.place(x=10, y=151)


b3_2=tkinter.Button(frame3, image=photo17, height="35", width="35", bd="0", relief="sunken", command=lambda:thanks())
b3_2.place(x=20, y=20)


b3_3=tkinter.Button(frame3, image=photo18, height="31", width="31", bd="0", relief="sunken", command=openweb16)
b3_3.place(x=9, y=126)


b3_4=tkinter.Button(frame3, image=photo19, height="31", width="31", bd="0", relief="sunken", command=openweb17)
b3_4.place(x=39, y=124)


b3_5=tkinter.Button(frame3, image=photo20, height="31", width="31", bd="0", relief="sunken", command=openweb18)
b3_5.place(x=69, y=125)


b3_6=tkinter.Button(frame3, image=photo21, height="31", width="31", bd="0", relief="sunken", command=openweb19)
b3_6.place(x=101, y=127)


b3_7=tkinter.Button(frame3, image=photo22, height="31", width="31", bd="0", relief="sunken", command=openweb20)
b3_7.place(x=129, y=124)


#frame3 buttom boundry







#frame4 top boundry

frame4=tkinter.Frame(a, height="175", width="175", bg="white")
frame4.place(x=175,y=175)


b4_2=tkinter.Button(frame4, image=photo24, height="19", width="73", bd="0", bg="white", relief="sunken")
b4_2.place(x=97, y=3)

#b4_1=tkinter.Button(frame4, image=photo27, height="21", width="21", bd="0", bg="white", relief="sunken")
#b4_1.place(x=0, y=3)

b4_3=tkinter.Button(frame4, image=photo29, height="9", width="9", bd="0", relief="sunken", command=save)
b4_3.place(x=113, y=9)

b4_4=tkinter.Button(frame4, image=photo30, height="9", width="9", bd="0", relief="sunken", command=open_file)
b4_4.place(x=131, y=9)

b4_4=tkinter.Button(frame4, image=photo31, height="9", width="9", bd="0", relief="sunken", command=openweb5)
b4_4.place(x=149, y=9)


frame7=tkinter.Frame(frame4, height="29", width="175", bg="#e9f0f7")
frame7.place(x=0,y=146)

frame8=tkinter.Frame(frame4, height="40", width="13", bg="#212754")
frame8.place(x=0, y=0)

frame9=tkinter.Frame(frame4, height="30", width="13", bg="#fec700")
frame9.place(x=13, y=0)

frame10=tkinter.Frame(frame4, height="22", width="13", bg="#ff8029")
frame10.place(x=26, y=0)


l4_1=tkinter.Label(frame4, image=photo25, height="57", width="57", bg="white")
l4_1.place(x=45, y=65)

l4_2=tkinter.Label(frame7, text=f"{datetime.now():%a, %b %d %Y}", fg="#1a2c54", font=("helvetica", 8))
l4_2.place(x=77, y=3)


#Clock Label Start
l4_3=tkinter.Label(frame4, font=("helvetica", 7, "bold"), bg="#1a2c54", fg="white", height="1", width="7")
l4_3.place(x=79, y=101)
tick()
#Clock Label End


l4_4=tkinter.Label(frame4, image=photo32, height="19", width="19", bd="0", bg="white")
l4_4.place(x=55, y=29)

l4_5=tkinter.Label(frame4, image=photo33, height="19", width="19", bd="0", bg="white")
l4_5.place(x=123, y=71)

l4_6=tkinter.Label(frame4, image=photo34, height="19", width="19", bd="0", bg="white")
l4_6.place(x=9, y=113)

#frame4 buttom boundry


# at the end of the program:
print("%f seconds" % (time.time() - start_time))


a.mainloop()


