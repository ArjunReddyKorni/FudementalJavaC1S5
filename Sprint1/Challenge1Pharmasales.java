Q1.Pharma Sales
............

sales dept - add 10 % bonus to their monythly salary
calculate bonus
sales- jene - annual sal-$120000
sales - david - annsal -$125000
Algorithm
..........
1.strat

2. if employee is from sales department

	2a.Calculate monthly_Salary = annual_Salary / 12 

	2b. then calculate bonus = ((monthly_Salary * 10) / 100)

	2c. Display bonus

3.if bonus of Employee1 is Greater than  Employee2 in sales department

	3a. Display Employee1 has received highest bonus

	3b. Else Display Employee2 has received highest bonus

4.while employee in sales department

	4a.calculate total_Bonus = Employee1 bonus + Employee2 bonus

	4b.calculate average_Bonus = total_Bonus / total number of employee in sales

	4c.display average_Bonus

5.calculate total_amount = average_Bonus * total number of employee in sales

	5a.and display total_amount
6.end

Pseudocode
.........
BEGIN
	GET Number of Employee
	IF employee is from sales department
		CALCULATE monthly_Salary = annual_Salary / 12 
		CALCULATE bonus = ((monthly_Salary * 10) / 100)
		PRINT bonus
	IF bonus of Employee1 is Greater than  Employee2 in sales department
		PRINT Employee1 has received highest bonus
	Else 
		PRINT Employee2 has received highest bonus
	WHILE employee in sales department
		CALCULATE total_Bonus = Employee1 bonus + Employee2 bonus
		CALCULATE average_Bonus = total_Bonus / total number of employee in sales 
		PRINT average_Bonus
	CALCULATE total_amount = average_Bonus * total number of employee in sales
		PRINT total_amount

END
