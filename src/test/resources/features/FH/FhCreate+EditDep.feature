@FH @IntegrationFH
Feature: FH Create+Edit department

@CreateEditDepartment
Scenario: User try to create and edit departments. Only FH pmo can do so

	Given a FH PMO logs in 
	When FH user goes into FH Homepage
	Then fh pmo creates Department
	When Department Profile is created, user validation description option
	Then user edits Department right after creation
	Then User will do a section edit on each section for codes and header
	And Browser closes