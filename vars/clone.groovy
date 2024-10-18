def call (String url,String branch) {
    echo "this is cloning step"
    git url :"https://github.com/rohit-fx/django-notes-app.git" , branch:"main"
                
    echo "code cloned successfully"
}
