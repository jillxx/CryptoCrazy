function checkDate() {
  var dateForm  = document.forms['date-form'];
  var startDate = new Date(dateForm['date1'].value);
  var endDate   = new Date(dateForm['date2'].value);

  if (startDate >= endDate) {
    alert("End Date cannot occur before the Start Date!");
    return false;
  } else return true;
}