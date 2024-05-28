import React from 'react';
import { Route, Switch } from 'react-router-dom';
import LoginComponent from './components/LoginComponent';
import RegisterComponent from './components/RegisterComponent';
import PropertyListComponent from './components/PropertyListComponent';
import SellerDashboardComponent from './components/SellerDashboardComponent';

function App() {
  return (
    <div className="App">
      <Switch>
        <Route exact path="/" component={PropertyListComponent} />
        <Route path="/login" component={LoginComponent} />
        <Route path="/register" component={RegisterComponent} />
        <Route path="/dashboard" component={SellerDashboardComponent} />
      </Switch>
    </div>
  );
}

export default App;
