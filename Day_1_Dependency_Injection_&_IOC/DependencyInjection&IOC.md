### Why we need Dependency Injection?
* **1.** Its a good coding practise to reduce dpenecencies of classes on each other.
* **2.** It makes testing easy when there are no dependencies or less dependencies.
* **3.** A class shuld ask what it wants insetad of creating everything.

---

### How do we inject dependencies?
* **1.** By making constructors and caling objects as paramters instead of creating them.

**Example:**
> In the OrderSrvice file, we defined `NotificationService` object but never created it. Then, we called its object created by main method in `Dependencyinjection` class and passed it as a parameter. In this way, we injceted dependency for notification.

---

### Whats its use?
It shifts control over to one entity instead of mixing up and doing random classes dependending on random other classes.

---

### Drawbacks
* **1.** Even though main handles all dependencies and object creations, it can become too heavy and complex because of too much services.

---

### What is IOC then?
IOC simply means to shift control to one entity. **OR** inverse the dependency. Same thing.

---

### Difference between DI and IOC
Simply **IOC** is idea or approach and **DI** is the way of implementing that idea.

---

### What does Spring Framework do?
It gives **IOC Container** which:
* **1.** Create Objects
* **2.** Manage Objects
* **3.** Connect objects together