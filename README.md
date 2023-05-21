# Multi-Threading Homework
This project features the family tree of Joseph Cardigan and his descendants! The family tree is structured as such:
* Joseph's parents are not included in the tree
* Parents of any family members not related by blood to Joseph are not included in the tree
* All other parents (i.e. descendant's spouses/partners) are listed, but THEIR parents are excluded

The goal of this task is to use multithreading to quickly navigate through the tree to find the family members that 
meet the conditions below.

Once the family member has been found - they should be written to a file using the provided static file-writing method
provided in the Main class.

Multi-threading should also be used to simultaneously run your solutions for all the criteria below - without running
into any conflicts when writing to the file.

__After a thread finds the solution to one of the criteria, it should stop all other threads trying to solve that same 
criteria__


*Disclaimer: All data used in this exercise - including first name, last name, birth date, and age - is purely fictitious. Any resemblance to existing persons, real or fictional, is entirely a coincidence.*

---
### Criteria
*Please do not hardcode any of the critical values in your solutions. Identify them dynamically by navigating the tree*

1. Find the youngest grandchild of Joseph Cardigan (exactly 2 generations down).
2. Find the family member that shares a birth month with June Molasses
3. Find the family member for whom the sum of all digits in their birthdate match the same type of some to one of 
Joseph Cardigan's children.
