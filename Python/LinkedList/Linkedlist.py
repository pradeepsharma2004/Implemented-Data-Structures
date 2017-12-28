class Node:
    def __init__(self,d,n):
        self.data=d
        self.Next=n

class linkedlist:
    head=Node(None,None)

    def insert(data):
        node=Node(data,None)
        if(head==None):
            head=node
        else:
            n=head
            while(n.Next!=None):
                n=n.Next
            n.Next=node
    def show():
        n=head
        while(n.Next!=0):
            print(n.data)
            n=n.Next
        print(n.Next)
    insert(15)

    show()
    
    
    
        
