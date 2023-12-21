function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = '';
  }

  var config = {
    env: env,
//    username: 'belajarKuy',
//    password: 'cobajadulu',
    baseURL: 'https://petstore.swagger.io/v2/user/'
//    body = {"name": "morpheus","job": "leader"}
    headerRegress = {Accept: 'application/json', Content-Type: 'application/json'}
  }

  karate.configure('connectTimeout',30000)
  karate.configure('readTimeout',30000)

  return config;
}