# YashManagement

POST : http://localhost:8081/insertEmployee

{
    "empName": "Mahima",
    "empAge": 21,
    "empMobileNo": 7349526024,
    "empAddress": {
        "address1": "Sant Kabir Nagar",
        "address2": "Pipra kala",
        "city": "Kkhalilabad",
        "state": "UP",
        "pin": "272178",
        "country": "India"
    },
    "empSalary": 1400
}

GET : http://localhost:8081/getEmployeeById/1

GET : http://localhost:8081/allEmployees

PUT : http://localhost:8081/updateEmployee/1

DELETE : http://localhost:8081/deleteEmployee/1
