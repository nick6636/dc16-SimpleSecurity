from flask import Flask, render_template, send_file
import datetime
import subprocess

app = Flask(__name__)

@app.route("/")
def index():
	return send_file("templates/index.html")

@app.route("/sendSignal/<signal>")
def main(signal):
	now = datetime.datetime.now()
	timeString = now.strftime("%m-%d-%Y %H: %M")
	templateData = {
		'title': 'Simple Security',
		'time': timeString
	}

	subprocess.call(["./codesend", signal, "-p", "0", "-l", "185"])	
	
	return send_file("templates/index.html")

if __name__ == "__main__":
	app.run(host='0.0.0.0', port=81, debug=True)

