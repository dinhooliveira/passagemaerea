
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item ">
        <a class="nav-link" href="${pageContext.request.contextPath}/admin/home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item  float-right">
        <a class="nav-link" href="${pageContext.request.contextPath}/UsuarioController?pagina=logout">Logout</a>
      </li>
     
    </ul>
    
  </div>
</nav>