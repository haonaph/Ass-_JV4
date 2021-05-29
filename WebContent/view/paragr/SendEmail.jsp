<%@ page pageEncoding="UTF-8"%>
<div class="row">
  <!doctype html>
  <html lang="en">
    <head>
      <title>Title</title>
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
      <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <main class="container">
          <section class="row">
            <div class="offset-3 col-6">
              <form action="/Ass/Send" method="post">
                <div class="card">
                  <div class="card-header">Send Video</div>
                  <div class="card-body">
                    <div class="form-group">
                      <label for="eamil">Your Friend email:</label>
                      <input type="text"
                        class="form-control" name="email" id="eamil" aria-describedby="helpId" placeholder="">
                      <small id="eamilId" class="form-text text-muted">Nhập Email</small>
                    </div>
                    <div class="card-footer text-right">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
                    
                  </div>
                </div>
              </form>
            </div>
          </section>
        </main>
      <!-- Optional JavaScript -->
      <!-- jQuery first, then Popper.js, then Bootstrap JS -->
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
  </html>
</div>