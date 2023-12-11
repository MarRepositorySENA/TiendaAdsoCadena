//se alamacena la url de la Api
var url= "http://localhost:8081/api/v1/clientes/";
function listarClientes(){
    //metodo para listar los clientes
    // se crea la peticion AJAX
$.ajax({
    url:url,
    type:"GET",
    success: function(result){
        //Success: función que se ejecuta 
        // cuando la petición tiene exito
        console.log(result);
        //Se crea un objeto que contenga
        // el cuerpo de la tabla
        var cuerpoTabla= document.getElementById("cuerpoTabla");
        //Se limpia el cuerpo de la tabla
        cuerpoTabla.innerHTML="";
        //Se hace un ciclo que recorra el areglo con los datos
        for (var i=0; i<result.length;i++) {
                //se crea una etiqueta tr(El tr es la fila) por 
                // cada registro
                var trRegistro=document.createElement("tr");
                let celdaId=document.createElement("td");

                //creamos un td(El td es una columna que se crea en la fila tr) por cada campo del registro
                let celdaTipoDocumento = document.createElement ("td");
                let celdaNumeroDocumento = document.createElement ("td");
                let celdaPrimerNombre = document.createElement ("td");                
                let celdaSegundoNombre = document.createElement ("td"); 
             
                




            //almacenamos el valor, el nombre que se pone es el de la api, del modelo
            // se debe hacer con todos los atributos de la entidad
            celdaId.innerText=result[i]["Id_Cliente"];

            //Se agrega la celda al registro 
            trRegistro.appendChild(celdaId);
            trRegistro.appendChild(celdaNumeroDocumento);
            //Una linea por cada campo 
            //se agrega el registro en la tabla
            cuerpoTabla.appendChild(trRegistro);

        }
    },
    error: function(error){
        /*
        error: función que se ejecuta cuando la petición 
        tiene un error
         */
        alert("Error en la petición ${error}");

    }
});
}