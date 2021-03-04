
The following file contains examples of requests that can be made using [curl](https://curl.se/) as alternative to [Postman](https://www.postman.com/). 


# List all customers

You can directly type _http://localhost:9090/api/clientes_ in your browser or use the following command

``` bash
curl http://localhost:9090/api/clientes/

#Tip 1: You can pipe the output to json_pp for a pretty printed json
curl http://localhost:9090/api/clientes/ | json_pp

#Tip 2: You can pipe the output to jq for a pretty printed json (same as json_pp)
curl http://localhost:9090/api/clientes/ | jq

#Tip 3: You can pipe the output to jq and query the response:
curl http://localhost:9090/api/clientes/ | jq .[0]
```


# Get an specific customer

You can directly type _http://localhost:9090/api/clientes/{id}_ in your browser or use the following command

``` bash
curl http://localhost:9090/api/clientes/1
```

# Create a customer

``` bash
curl -X POST -H "Content-Type: application/json" \
    -d '{"idCliente": 1, "nombre": "Pepe", "apellidos": "Gonzalez", "direccion": null, "telefono": null, "email": "pepe.gonzalez@example.com" }' \
    http://localhost:9090/api/clientes
```

# Delete a customer

``` bash
curl -X DELETE http://localhost:9090/api/clientes/1
```


# Update a customer

``` bash
curl -X PUT -H "Content-Type: application/json" \
    -d '{"idCliente": 1, "nombre": "Pepe", "apellidos": "Gonzalez", "direccion": "Calle de la piruleta", "telefono": "0123456789", "email": "pepe.gonzalez@example.com" }' \
    http://localhost:9090/api/clientes
```

