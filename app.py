from flask import Flask, render_template
import datetime
import subprocess

app = Flask(__name__)

@app.route("/")
def backend():
	now = datetime.datetime.now()
	timeString = now.strftime("%Y-%m-%d %H:%M")
	templateData = {
		'title': 'Simple Security',
		'time': timeString
	}

	return render_template('main.html', **templateData)

@app.route("/<signal>")
def main(signal):
	now = datetime.datetime.now()
	timeString = now.strftime("%m-%d-%Y %H: %M")
	templateData = {
		'title': 'Simple Security',
		'time': timeString
	}

	subprocess.call(["./codesend", signal, "-p", "0", "-l", "185"])	
	
	return render_template('main.html', **templateData)

if __name__ == "__main__":
	app.run(host='0.0.0.0', port=81, debug=True)

