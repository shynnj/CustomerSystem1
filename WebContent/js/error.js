//xử lý login
function myFunction() {
	var x = document.getElementById("txtUserID").value;
	var y = document.getElementById("txtPassword").value;

	if (x == "") {
		document.getElementById("lblError").innerHTML = "Error Message1";
		return false;
	} else if (y == "") {
		document.getElementById("lblError").innerHTML = "Error Message2";
		return false;
	}
	return true;
}

//xử lý clear
function myFunction1() {
	document.getElementById("lblError").innerHTML = "";
	var x = document.getElementById("txtUserID").value = "";
	var y = document.getElementById("txtPassword").value = "";

}
//xử lý check all
function toggle(source) {
    var checkboxes = document.querySelectorAll('input[type="checkbox"]');
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i] != source)
            checkboxes[i].checked = source.checked;
    }
}