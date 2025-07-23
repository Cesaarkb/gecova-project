# Proyecto Gecova - Peticiones

Login, perimte el ingreso a la aplicacion. Contiene validaciones del lado del cliente.

![Login con validaciones](/frontend/GecovaFront/docs/imgs/loginDesck.png)


Una vez autenticado el usuario, se peude acceder a la vista de home.
![Home](/frontend/GecovaFront/docs/imgs/home.png)

En el home es apreciable los botones de peticiones, se puede accedera las petiones
que tiene cada usuario presionando el boton de Peticion lo cual dirige a una vista diferente.

![Home](/frontend/GecovaFront/docs/imgs/listadoPeticiones.png)

Para agregar una nueva peticion se puede presionar el boton de Nueva peticion, esta acción
despliega un formulario.

![Home](/frontend/GecovaFront/docs/imgs/peticion.png)

Para la parte del backend, se uso una arquitectura Hexagonal. 

Al realizar una peticion de tipo Get a la url http://localhost:8080/peticion se obtiene lo siguiente.

```
[
    {
        "id": 1,
        "customer": "customerex",
        "organizationUnit": "orgex,
        "managerName": "managerex",
        "applicant": "appex",
        "companyName": "comex",
        "priority": "prioex",
        "position": 1,
        "typeContratc": "typeex",
        "projectCode": "projectex",
        "projectName": "projectex",
        "elementContratc": "elementex",
        "monthAssign": 1,
        "mode": "modeex",
        "definitivePlace": "definitiveex",
        "typeAssign": "typeex",
        "careerPlan": "careerex",
        "developmentRole": "developmentex",
        "talentPerformance": "talentex",
        "rate": 1.0,
        "rateCap": 1.0,
        "projectType": "projectex",
        "budgetedMargin": 00.00,
        "accumulatedMargin": 00.00,
        "recoveryPlan": "recoveryex",
        "generalComments": "generalex",
        "profile": "profileex",
        "level": "levelex",
        "technicalKnowledge": "techex",
        "functionalKnowledge": "teches"
    },
     {
        "id": 2,
        "customer": "customerex",
        "organizationUnit": "orgex,
        "managerName": "managerex",
        "applicant": "appex",
        "companyName": "comex",
        "priority": "prioex",
        "position": 1,
        "typeContratc": "typeex",
        "projectCode": "projectex",
        "projectName": "projectex",
        "elementContratc": "elementex",
        "monthAssign": 1,
        "mode": "modeex",
        "definitivePlace": "definitiveex",
        "typeAssign": "typeex",
        "careerPlan": "careerex",
        "developmentRole": "developmentex",
        "talentPerformance": "talentex",
        "rate": 1.0,
        "rateCap": 1.0,
        "projectType": "projectex",
        "budgetedMargin": 00.00,
        "accumulatedMargin": 00.00,
        "recoveryPlan": "recoveryex",
        "generalComments": "generalex",
        "profile": "profileex",
        "level": "levelex",
        "technicalKnowledge": "techex",
        "functionalKnowledge": "teches"
    }

]
```

Si es rezalida una peticion Get con la siguiente url http://localhost:8080/peticion/1 se puede obtener lo mostrado a continuacion.

```

    {
        "id": 1,
        "customer": "customerex",
        "organizationUnit": "orgex,
        "managerName": "managerex",
        "applicant": "appex",
        "companyName": "comex",
        "priority": "prioex",
        "position": 1,
        "typeContratc": "typeex",
        "projectCode": "projectex",
        "projectName": "projectex",
        "elementContratc": "elementex",
        "monthAssign": 1,
        "mode": "modeex",
        "definitivePlace": "definitiveex",
        "typeAssign": "typeex",
        "careerPlan": "careerex",
        "developmentRole": "developmentex",
        "talentPerformance": "talentex",
        "rate": 1.0,
        "rateCap": 1.0,
        "projectType": "projectex",
        "budgetedMargin": 00.00,
        "accumulatedMargin": 00.00,
        "recoveryPlan": "recoveryex",
        "generalComments": "generalex",
        "profile": "profileex",
        "level": "levelex",
        "technicalKnowledge": "techex",
        "functionalKnowledge": "teches"
    }


```