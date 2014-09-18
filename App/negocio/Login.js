var Login = (function(){
	var self = Object.create({});

	var usuario;
	self.getUsuario = function(){
		return usuario;
	}
	self.setUsuario = function(valor){
		usuario = valor;
	}

	var password;
	self.getPassword = function(){
		return password;
	}
	self.setPassword = function(valor){
		password = valor;
	}

	self.validar = function(u, p){
		return (u==p) && (p.length >= 4);
	}	

	return self;
});


var a1 = new Login();
var a2 = new Login();
a1.setUsuario("jose");
a2.setPassword("jose");

console.log (a1,a2);