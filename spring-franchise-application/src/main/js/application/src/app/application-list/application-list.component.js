<div class="card my-5">
  <div class="card-body">
    <table class="table table-bordered table-striped">
      <thead class="thead-dark">
        <tr>
          <th scope="col">#</th>
          <th scope="col">Name</th>
          <th scope="col">Email</th>
        </tr>
      </thead>
      <tbody>
        <tr *ngFor="let user of applications">
          <td>{{ application.id }}</td>
          <td>{{ application.name }}</td>
          <td><a href="mailto:{{ application.email }}">{{ application.email }}</a></td>
        </tr>
      </tbody>
    </table>
  </div>
</div>