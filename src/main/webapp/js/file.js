function checkDate() {
	var dateForm = document.forms['date-form'];
	var startDate = new Date(dateForm['date1'].value);
	var endDate = new Date(dateForm['date2'].value);

	console.log("startdate:" + startDate)
	console.log("endDate:" + endDate)

	if (!checkDateLimit()) {
		return false;
	}
	if (startDate >= endDate) {
		document.getElementById("invaliddate").innerHTML = "Purchase Date cannot occur before the Sell Date!";
		return false;
	} else {
		setLimit();
	}
	return true;

}

function checkDateLimit() {
	var dateForm = document.forms['date-form'];
	var startDate = new Date(dateForm['date1'].value);
	var dateLimit = new Date(window.localStorage.getItem("dateLimit"));

	console.log("startdate:" + startDate)
	console.log("dateLimit:" + dateLimit)

	if (dateLimit >= startDate) {
		document.getElementById("invaliddate").innerHTML = "You can't go backwards! Your last sell date was " + dateLimit + "!";
		return false;
	} else
		return true;
}

function setLimit() {
	var dateForm = document.forms['date-form'];
	var dateLimit = new Date(dateForm['date2'].value);
	window.localStorage.setItem("dateLimit", dateLimit);

	console.log("datelimit:" + dateLimit)
}
