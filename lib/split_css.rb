require './css_splitter'

cssFile = File.join(ARGV[0], "DP-all.css")

print "CSS to Process: " + cssFile
infile = File.join(File.dirname(__FILE__), '..', 'src/main/sencha-app/build/DP/production/resources', 'DP-all.css')

CssSplitter.split(cssFile, File.dirname(cssFile), 4000)

CssSplitter.split(infile, File.dirname(infile), 4000)

